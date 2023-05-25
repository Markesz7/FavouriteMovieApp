# FavouriteMovieApp
## Notes for running the server
- If you run it with IntelliJ Idea IDE, latest version is recommended (I had problems with the jpa kotlin plugin with previous versions)
- Instructions for running it with maven:
    - In the root directory: `mvn clean package`
    - This will generate a jar file in the target folder. You can run this with `java -jar <JarName>.jar`
- API is available at `localhost:8080/api/` by default
- There is one test data in `JSON` format in the json folder and there is a postman export json file as well to test the server