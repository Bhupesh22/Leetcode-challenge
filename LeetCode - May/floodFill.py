class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, newColor: int) -> List[List[int]]:
        nb_row = len(image)
        nb_col = len(image[0])
        
        old_color = image[sr][sc]
        delta_x = [0, 0, 1, -1]
        delta_y = [1, -1, 0, 0]
        
        self.old_image = self.new_image = image
        self.visited = set()

        def fill_pixel(x, y):
            if (x, y) not in self.visited:
                self.visited.add((x, y))
                if self.old_image[x][y] == old_color:
                    self.new_image[x][y] = newColor
                    for i in range(4):
                        new_x = x + delta_x[i]
                        new_y = y + delta_y[i]
                        if new_x >= 0 and new_x < nb_row and new_y >= 0 and new_y < nb_col:
                            fill_pixel(new_x, new_y)

        fill_pixel(sr, sc)
        return self.new_image