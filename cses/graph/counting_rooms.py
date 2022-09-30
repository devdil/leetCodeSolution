def countRooms(rows, cols):
    roommap = []

    # read the entire graph
    for row in range(rows):
        roommap.append(list(input()))

    total_rooms = 0

    for row in range(rows):
        for col in range(cols):
            if roommap[row][col] == '.':
                items = explore(row, col, roommap, rows, cols)
                total_rooms += 1
                if items == rows * cols:
                    return total_rooms

    return total_rooms


def explore(row, col, roommap, rows, cols):
    stck = []
    stck.append((row, col))
    items = 0
    while stck:
        row, col = stck.pop()

        if roommap[row][col] == '#':
            continue

        else:
            roommap[row][col] = '#'
            items += 1
            for neighbours_index in [[0, 1], [0, -1], [1, 0], [-1, 0]]:
                adjacent_row = row + neighbours_index[0]
                adjacent_col = col + neighbours_index[1]

                if not (adjacent_row < 0 or adjacent_row >= rows or adjacent_col < 0 or
                        adjacent_col >= cols or roommap[adjacent_row][
                            adjacent_col] == '#'):
                    stck.append((adjacent_row, adjacent_col))

    return items


import sys

# print(sys.getrecursionlimit())
rows, cols = map(int, input().split(' '))
print(countRooms(rows, cols))