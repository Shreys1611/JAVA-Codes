import socket

# Define the server address and port
SERVER_ADDRESS = 'localhost'
SERVER_PORT = 54321

# Create a socket object
server_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

# Bind the socket to the server address and port
server_socket.bind((SERVER_ADDRESS, SERVER_PORT))

# Receive packets from clients
while True:
    data, client_address = server_socket.recvfrom(1024)
    print("Received packet from client:", data.decode())
    number = int(data.decode())
    if number % 2 == 0:
        result = "even"
    else:
        result = "odd"
    server_socket.sendto(result.encode(), client_address)