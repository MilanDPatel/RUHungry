RU Hungry - Restaurant Management Assignment

Overview

The RU Hungry project simulates the management of a fictitious restaurant’s menu, stock, transactions, and guests using object-oriented programming and data structures. The goal of this assignment is to implement methods for seating guests, taking orders, handling donation requests, restocking the pantry, and tracking all transactions in a linked list. The assignment also requires the use of a hash table for managing stock using separate chaining.

Components

Menu
	•	Menu: Represents the restaurant’s menu, which consists of different categories with linked lists of dishes. The categories and dishes are defined using arrays.
	•	MenuNode: Each node contains information about a dish within a category.

Stock
	•	Stock: The stock is implemented as a hash table, where each index contains a linked list of stock items (ingredients). The hash function for this table is based on the ingredient ID.
	•	StockNode: A node in the stock list containing the ingredient’s details.

Transactions
	•	Transaction: Each transaction is stored in a linked list to track all successful and unsuccessful orders, donations, and restocks.
	•	TransactionNode: A node containing the details of the transaction.

Guests
	•	Seating Guests: A queue is used to manage guest seating. The program must find an available table that can accommodate a party’s size, or “kick” out a party to seat the incoming one when necessary.

Implementation Details

The program simulates a restaurant’s daily operations and ensures that each guest’s transaction, order, and donation request are properly handled.

Key Methods:
	•	Menu Management: Implemented using linked lists to manage the dishes within menu categories.
	•	Stock Management: A hash table is used for managing inventory items (ingredients). The hash function ensures that each item is placed in the correct slot of the table.
	•	Transaction Recording: All actions, such as orders, donations, and restocks, are logged in a linked list for tracking and generating receipts.
	•	Seating Guests: This involves dequeuing guests from a waiting list and placing them at an available table that can accommodate their party size.

Data Structures Used:
	•	1D Arrays: For managing tables and menu categories.
	•	Linked Lists: For storing menu items, stock items, and transaction logs.
	•	Hash Tables: For managing stock using separate chaining for collision resolution.
	•	Queue: For managing the seating of guests.

Approach
	1.	Menu: Populate the menu with categories and linked lists of menu items (dishes).
	2.	Stock: Implement a hash table to store and manage the ingredients using separate chaining.
	3.	Transactions: Track all successful and failed transactions in a linked list.
	4.	Seating: Efficiently seat guests by finding a table with enough seats, and manage guest arrival order through a queue.
