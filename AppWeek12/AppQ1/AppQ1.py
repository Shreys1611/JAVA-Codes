import socket

# Define the server address and port
SERVER_ADDRESS = 'localhost'
SERVER_PORT = 12345

# Create a socket object
client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# Connect to the server
client_socket.connect((SERVER_ADDRESS, SERVER_PORT))

# Send a message to the server
message = 'Hello, Server!'
client_socket.send(message.encode())

# Receive a response from the server
response = client_socket.recv(1024).decode()
print(response)

# Close the socket
client_socket.close()