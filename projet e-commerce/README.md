# Shopping System Readme

## Design Decisions

### Classes and Relationships

The shopping system is designed with a set of classes that represent different entities in the system. The classes include:
### Key Classes
- **User**: Represents a user with attributes such as username, password, and role.
- **UserDatabase**: Manages the collection of signed-in users and provides methods for user-related operations.
- **Product**: Represents a generic product with attributes like ID, name, price, etc..
- **ProductManager**: Manages the collection of products and provides methods for product-related operations.
- **ShoppingCart**: Manages the products added by a user for purchase.
- **Order**: Represents a user's order with details like products, total price, and order status.
- **Orders**: Contains a list of orders.
- **LoginManager**: Facilitates user authentication and login.
### Non-Key Classes

In addition to the key classes mentioned above, the system includes several non-key classes that contribute to its overall functionality. These include:

- **Review**: Represents user feedback on products and includes attributes like username, rating, and comments.
- **ReviewManager**: Manages product reviews, allowing users to submit and retrieve feedback.
- **ShippingManager**: Handles various shipping methods and calculates shipping costs based on the products in the cart and the shipping method chosen.
- **ProductSearch**: Implements methods for searching and filtering products based on different criteria.
- **PaymentProcessor**: Simulates basic payment transactions within the system. Includes methods for processing payments.
- **Inventory**: Maintains product quantities and updates inventory post-purchase. Handles low/out-of-stock scenarios.

### Overall Architecture

The system follows a modular architecture with classes encapsulating their functionalities. The `User` class encapsulates user-related information, and the `UserDatabase` class manages user interactions. The `Product` and `ProductManager` classes encapsulate product-related operations. The `ShoppingCart` and `Order` classes handle the shopping process, while non-key classes contribute to specific features and functionalities such as payment, reviews, shipping etc..

## Implementation of OOP Principles

### Encapsulation

- Each class encapsulates its attributes and methods, exposing only what is necessary for other classes to interact with it.
- For example, the `User` class encapsulates details like username and password, and the `ShoppingCart` class encapsulates the list of items in the cart.

### Inheritance

- Inheritance is utilized for specialized product categories. For instance, the `ElectronicsProduct`, `FoodProduct`, `ClothingProduct`, and `BookProduct` classes inherit from the generic `Product` class.
- This promotes code reuse and enables the use of polymorphism.

### Polymorphism

- Polymorphism is evident in the handling of different product categories. The `ProductManager` class, for example, can work with products of any category due to polymorphic behavior.

## Implementation of Optional Features

### Feature 1: Review System

- The `Review` and `ReviewManager` classes were introduced to facilitate user feedback on products.
- The `ReviewManager` class encapsulates operations related to managing product reviews.

### Feature 2: Shipping Manager

- The `ShippingManager` class handles various shipping methods, and it calculates shipping costs based on the products in the cart.
- The integration with the `ShoppingCart` class leverages polymorphism, allowing different products to contribute to the overall shipping cost.

## Usage 
1. **Clone the Repository**

2. **Run Main2.java in src folder**

#### Allow me to guide you through the  functionality of the system, illustrating how each component works harmoniously to provide a user-friendly and efficient experience.

- First of all you'll encounter a menu offering the choice to log in, register, or exit the system.
Registering is a breeze: input your username and password to create a new customer account, as admin roles can only be assigned through specific administrative channels and not within the main menu.
When logging in, provide your username and password. If the credentials are incorrect, you'll be notified, and the system will return to the main menu. Once logged in, customers access a Customer Menu, while admins have the flexibility to toggle between admin and customer roles during the program's runtime allowing them to access Admin Menu or Customer Menu depending on their choice.
- The customer menu offers various options, empowering users to view products, search by category/price/keyword, add products to a cart, view the cart, proceed to checkout, rate products, and seamlessly log out.
- The admin menu provides a range of functionalities, enabling administrators to add products, update product details (name, quantity, price, etc.), remove products entirely, view inventory, delete users by username, and display comprehensive user information via the user database.
#### Note that certain admin functionalities can be seamlessly expanded, including the ability to view orders, modify product IDs, manually add other users (with admin or customer roles), and even delete the entire user database or inventory.
#### I've also pre-initialized some products and users in the Main class, ensuring that the inventory and user database have content from the start of the program.
