import socket

# Define the server address and port
SERVER_ADDRESS = 'localhost'
SERVER_PORT = 12345

# Create a socket object
client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# Connect to the server
client_socket.connect((SERVER_ADDRESS, SERVER_PORT))

# Send a list of numbers to the server
numbers = [1, 2, 3, 4, 5]
message = ','.join(str(num) for num in numbers)
client_socket.send(message.encode())

# Receive the sum of the numbers from the server
response = client_socket.recv(1024).decode()
print("Sum of the numbers:", response)

# Close the socket
client_socket.close()