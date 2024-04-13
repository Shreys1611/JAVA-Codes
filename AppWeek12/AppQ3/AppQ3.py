import socket

# Define the server address and port
SERVER_ADDRESS = 'localhost'
SERVER_PORT = 12345

# Create a socket object
client_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

# Send a message to the server
message = 'UDP Message'
client_socket.sendto(message.encode(), (SERVER_ADDRESS, SERVER_PORT))

# Receive a response from the server
response, server_address = client_socket.recvfrom(1024)
print("Received response from server:", response.decode())

# Close the socket
client_socket.close()