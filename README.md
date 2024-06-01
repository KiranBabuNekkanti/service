1. Code Repo Url: https://github.com/KiranBabuNekkanti/books-service.git
2. Books service API (Backend ServiceDocker image url): https://hub.docker.com/layers/kiranbabun/books-service/latest/images/sha256-680f22ce90d2738e2a0e0556f4de2f2439d955f10eb98e982de9a9bf3ec50f75?context=repo
3. postgres-image-url: https://hub.docker.com/_/postgres
4. java 17 image url: https://hub.docker.com/_/openjdk
5. API Endpoints:
   a. End Point to get existing books:
        i. Http Method: GET 
        ii.URL: http://34.93.59.207/v1/books-service/books
   b. End Point to save new books:
        i. Http Method: POST 
        ii.URL: http://34.93.59.207/v1/books-service/books
        iii. Request Body:
            {
               "name": "How to be Happy",
                "author": "Ruskin Bond",
                "price": "299"
            } 