import socket
import random

# Define the server address and port
SERVER_ADDRESS = 'localhost'
SERVER_PORT = 12345

# Create a socket object
client_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

# Generate a random number
number = random.randint(1, 100)
print("Sending number:", number)

# Send the number to the server
client_socket.sendto(str(number).encode(), (SERVER_ADDRESS, SERVER_PORT))

# Receive the result from the server
result, server_address = client_socket.recvfrom(1024)
print("Received result from server:", result.decode())

# Close the socket
client_socket.close()