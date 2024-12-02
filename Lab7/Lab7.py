def generate_pattern_matrix(size, filler):
    # Initialize an empty matrix
    matrix = []

    # Generate the upper part of the pattern
    for i in range(size // 2):
        row = [filler if j < size // 2 else ' ' for j in range(size)]
        matrix.append(row)

    # Generate the lower part of the pattern
    for i in range(size // 2):
        row = [' ' if j < size // 2 else filler for j in range(size)]
        matrix.append(row)

    return matrix

def print_matrix(matrix):
    for row in matrix:
        print("\t".join(row))

def main():
    try:
        size = int(input("Введіть розмір квадратної матриці: "))
        filler = input("Введіть символ-заповнювач: ")
        if len(filler) != 1:
            raise ValueError("Символ-заповнювач введено невірно.")

        # Generate the pattern matrix
        matrix = generate_pattern_matrix(size, filler)

        # Print the matrix
        print_matrix(matrix)

    except ValueError as e:
        print(e)

if __name__ == "__main__":
    main()
