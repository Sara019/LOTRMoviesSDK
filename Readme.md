## ReadMe - Lord Of Rings Movie API SDK

This is a Java SDK and would be extended to other languages in the future. 

Its purpose is to abstract and ease complex, repetitive development tasks
involved in implementing Movie API. 

## Installation 
It is in Maven repository. Adding it to pom.xml would download the jar file.

`<dependency>
            <groupId>io.github.sara019</groupId>
            <artifactId>LOTRMoviesSDK</artifactId>
            <version>2.0</version>
</dependency>`

If you are not using Maven, you can add the jar through IDE :
Right-click on your project.
Select Build Path.
Click on Configure Build Path.
Click on Libraries and select Add External JARs.
Select the jar file from the required folder.
Click and Apply and Ok.


## LIBRARIES for MOVIE API (Usage examples)

All libraries are present in LOTRMovieAPIClient.java class. So, in order to use
any of them, first instantiate the class like below - 

`LOTRMovieAPIClient apiClient = new LOTRMovieAPIClient();`

1. To retrieve all LOR movies - method signature - `getMovies(); `
   This gets all the Lord of Ring movies. To call it, use
   the instance created above, like
   `apiClient.getMovies();`

Return - it returns a list of LOR movies (`List<LOTRMovie>`), which needs to be iterated in order to 
fetch specific attributes -

`List<LOTRMovie> moviesList = apiClient.getMovies();
for (LOTRMovie movie: moviesList) {
    //any code here
    System.out.println(movie.getMovieId()+ "-" + movie.getName());
}`

There are getters/setters for every attribute in LOTRMovie class which can be used 
in your code. Intellisense in IDE's would be helpful here. If not, feel free to go to 
the class to check out its methods/attributes. 


2. To get specific movie data - method signature - `getMovie(String movieId)`. This
needs an input id as String to be specified. You can get the id information from above library 
and use it here as input. Based on the movie you are interested in, you can pass its id
and this will return all its associated information. 


RETURN - it returns one LOTRMovie object which can be used invoke its associated 
methods. 
//calling the method - `apiClient.getMovie("1");` Ensure you give a valid Id. If otherwise,
the system will handle it and give you a message. 

`LOTRMovie movie = apiClient.getMovie("1");
movie.getName();` //give you the movie name, similarly you can access other methods. 

3. To get specific movie dialogs - method signature - `getMovieQuotes(String movieId)`.
This again needs an input id as String to be specified. Based on the movie you are interested in, 
you can pass its id and this method will return all the dialogs from it.

RETURN - it returns a list of LOTRMovieDialog object `List<LOTRMovieDialog>` which can be used
to invoke its associated methods.

//calling the method - `apiClient.getMovieQuotes("3");`

`List<LOTRMovieDialog> movieDialogs = apiClient.getMovieQuotes("3");
for(LOTRMovieDialog dialog: movieDialogs) {
    dialog.getDialog();
}`

Similarly you can access other methods in this class.

Have fun leveraging and exploring the SDK for API operations!

 