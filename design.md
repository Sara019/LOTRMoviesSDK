# DESIGN - Lord of the Rings API SDK 


This project is implemented using `Java` programming language and `Maven` build tool.
It is designed to ease the development work to implement the one-api-dev
Lord of Rings Movie APIs. 

[LOTRMovieAPIClient.java](src%2Fmain%2Fjava%2Fcom%2Flordsdk%2Fsdkservice%2FLOTRMovieAPIClient.java)
is the API Client implementation of the Movie API. 
Users of this SDK should instantiate this class to utilize its libraries/methods.

It provides three methods for each of the endpoints of the Movie API with return types 
based on the API response and function purpose.

#### Security 
API Authorization token would be passed as an input by the client. As we have 
one fixed Bearer key for this project, its stored as a constant and used in classes.

### Object Oriented Approach
Decoupled most of the functionalities and used single responsibility for each 
entity/class.
Created models for each unique entities and to deserialize 
JSON API (GSON library for deserialization) response to Java Object. 

Created methods for mostly used code to reuse efficiently.
Instantiated a couple of fields during object creation (in LOTRMovieAPIClient.java) to avoid creating a new
instance each time as the methods are invoked. 


### Exceptions
Customized exception handling. Two API endpoints need input id from user - instead of 
ambiguously throwing Null Pointer Exception or returning empty values, [MissingIdException.java](src%2Fmain%2Fjava%2Fcom%2Flordsdk%2Fexception%2FMissingIdException.java)
informs user that 'ID field is required'.

It also abstracts the exception pertaining to the SDK code which the user might not be 
aware of. The exceptions that user might not be able to resolve or debug is abstracted 
in a common class [MovieException.java](src%2Fmain%2Fjava%2Fcom%2Flordsdk%2Fexception%2FMovieException.java)
Since Movie endpoints (all GET methods) are only handled, for simplicity, generic
Exception is being catch-ed. This would be implemented for specific exceptions and each error code
catch-ed would be handled to minimize work for users in a real-time project.

### Testing

Used the libraries as an end user and verified the functionalities for edge cases and Null
values, and incorrect values to check how the SDK is responding.


```
As with any project, this too would constantly evolve and get better. Please do share 
your suggestions for improvement. Each class/method has a brief description, please check them for 
their specific purposes. Thank you!
```