class Solution:
    def isCousins(self, root: TreeNode, x: int, y: int) -> bool:
        node_data = collections.defaultdict(list)
        queue = collections.deque([(root, None, 0)])
        while queue:

            if len(node_data) > 2:
                break

            node, parent, depth = queue.popleft()
            if node.val == x or node.val == y:
                node_data[node.val] = [parent, depth]

            if node.left:
                queue.append((node.left, node.val, depth + 1))

            if node.right:
                queue.append((node.right, node.val, depth + 1))

        return node_data[x][0] != node_data[y][0] and node_data[x][1] == node_data[y][1]
        
    