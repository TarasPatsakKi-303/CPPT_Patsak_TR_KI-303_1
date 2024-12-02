import math
import struct

# Function to calculate y = sin(x) / tan(4x)
def calculate_y(x):
    """
    This function calculates y = sin(x) / tan(4x)
    
    Parameters:
        x (float): The input value for x in radians.
        
    Returns:
        float: The result of sin(x) / tan(4x).
    """
    try:
        result = math.sin(x) / math.tan(4 * x)
        return result
    except ValueError as e:
        print(f"Error in calculation: {e}")
        return None

# Function to read data from a text file
def read_text_file(filename):
    """
    Reads a text file and returns its content.
    
    Parameters:
        filename (str): The name of the file to read.
        
    Returns:
        str: The content of the file.
    """
    try:
        with open(filename, 'r') as file:
            return file.read()
    except FileNotFoundError:
        print(f"File {filename} not found.")
        return None

# Function to write data to a text file
def write_text_file(filename, data):
    """
    Writes data to a text file.
    
    Parameters:
        filename (str): The name of the file to write to.
        data (str): The content to write into the file.
    """
    with open(filename, 'w') as file:
        file.write(data)

# Function to read data from a binary file
def read_binary_file(filename):
    """
    Reads data from a binary file and returns it as a float.
    
    Parameters:
        filename (str): The name of the binary file to read.
        
    Returns:
        float: The data read from the binary file.
    """
    try:
        with open(filename, 'rb') as file:
            data = file.read(8)  # Read 8 bytes (size of float)
            return struct.unpack('d', data)[0]
    except FileNotFoundError:
        print(f"File {filename} not found.")
        return None

# Function to write data to a binary file
def write_binary_file(filename, data):
    """
    Writes a float value to a binary file.
    
    Parameters:
        filename (str): The name of the binary file to write to.
        data (float): The data to write into the file.
    """
    with open(filename, 'wb') as file:
        file.write(struct.pack('d', data))  # 'd' for double precision float

if __name__ == "__main__":
    # Example usage of the functions
    x_value = 0.5  # Example x value in radians
    result = calculate_y(x_value)
    
    if result is not None:
        print(f"Result of y = sin(x) / tan(4x) for x = {x_value}: {result}")
        
        # Writing and reading to/from text files
        write_text_file('result.txt', f'Result for x={x_value}: {result}\n')
        print("Result written to result.txt.")
        
        # Writing and reading to/from binary files
        write_binary_file('result.bin', result)
        print("Result written to result.bin.")
        
        # Reading from files
        text_data = read_text_file('result.txt')
        print(f"Content of result.txt: {text_data}")
        
        binary_data = read_binary_file('result.bin')
        print(f"Data read from result.bin: {binary_data}")
