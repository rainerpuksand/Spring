### Building program steps
- Requirements
- Business requirements - what application should do
- Identify initial requirement
- Work on details of initial requirements
- Technical requirements -  technology stack (framework/languages)
- Translation of business requirements into technical ones

### Notes application

    -Business requirments:

- storing and managing (add/edit) notes
- adding extra stuff to notes
- status - (new/in progress/done)
- remainders about dates

### Steps for adding reservations (JSON)
- data structure for information to send - how to translate it?
- controller with endpoint
- service for processing the data
- repository -- should save data into database
- database table
- what to send in response to client???

### MVC pattern
- Model (data + operations on data)
- View (views presented to user)
- Controller (handling incoming requests and provides views for clients/users)

### Application architecture with MVC
- View
- Controller
- Model (Service + Repository)

### Application architecture with MVC - second view
- View, presented to user
- Controller (should have reference to Service), handling incoming requests and provides views for clients/users
- Service (should have reference to Repository), processed data
- Repository, stores and provides access to data (eg. database)

