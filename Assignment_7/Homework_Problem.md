# *Homework Problem 1: HTTP and REST API Concepts*

**<h2>Hypertext Transfer Protocol (HTTP)</h2>**
> HTTP is a set of rules that define how web browsers and web servers communicate with each other. When you type a URL (Uniform Resource Locator) like "https://www.example.com" into your browser and hit Enter, your browser is making an HTTP request to the server hosting the website.
> The communication between your browser and the server happens through a process called the request-response cycle:
>
>Request: Your browser sends an HTTP request to the server, asking for a specific resource (like a web page, an image, or data from a database).
>
>Server Processing: The server receives the request, processes it, and generates a response containing the requested resource or data.
>
>Response: The server sends the response back to your browser, which interprets it and displays the content.
> 
> <b>An HTTP request is made up of several parts: </b>
>
>HTTP Method: Specifies the type of action you want to perform on the resource. Common methods include GET (retrieve data), POST (send data), PUT (update data), and DELETE (remove data).
>
>URL: The Uniform Resource Locator that identifies the resource you're requesting.
>
>Headers: Additional information about the request, like the type of data you can accept, authentication tokens, etc.
>
>Body (for POST and PUT requests): If you're sending data to the server, like when submitting a form, the data goes here.
> 
> <b>An HTTP response has similar components:</b>
>
>Status Code: A numeric code that indicates the status of the response. For example, 200 means success, 404 means "not found," and 500 means an internal server error.
>
>Headers: Additional information about the response, like content type, caching instructions, etc.
>
>Body: The actual data you requested. This could be HTML content, images, JSON data, etc.


<br>


<h2>Representational State Transfer (REST)</h2>
>REST (Representational State Transfer) is an architectural style for designing networked applications. A RESTful API is a way to build and interact with web services that follow these principles. It's a standardized way for different software applications to communicate and exchange data over the internet.
> 
> <b> Key Concepts of RESTful APIs:</b>
>
>Resources: In a REST API, everything is a resource. A resource could be a piece of data or an object that the API exposes.
>
>HTTP Methods: REST APIs use HTTP methods to perform actions on resources:
>
>GET: Retrieve data from the server.
>POST: Send data to the server to create a new resource.
>PUT: Update existing resource data on the server.
>DELETE: Remove a resource from the server.
>Uniform Resource Identifiers (URIs): Resources are identified using URIs (URLs). For example, /users could represent a collection of user data.
>
>Stateless: Each API request is independent and doesn't rely on previous requests. The server doesn't store the client's state.
>
> <b> Example of a RESTful API:</b>
>
>Endpoint: `https://jsonplaceholder.typicode.com/users`
> 
>API Description: This is a public JSONPlaceholder API that simulates a backend server for practicing and learning purposes. It provides data about users.
>
>HTTP Method: GET
> 
> Response Example:
>
<pre>
[
  {
    "id": 1,
    "name": "Leanne Graham",
    "username": "Bret",
    "email": "Sincere@april.biz",
    "address": {
      "street": "Kulas Light",
      "suite": "Apt. 556",
      "city": "Gwenborough",
      "zipcode": "92998-3874"
    },
    "phone": "1-770-736-8031 x56442",
    "website": "hildegard.org",
    "company": {
      "name": "Romaguera-Crona",
      "catchPhrase": "Multi-layered client-server neural-net",
      "bs": "harness real-time e-markets"
    }
  },
  // ... more user objects ...
]
</pre>
>