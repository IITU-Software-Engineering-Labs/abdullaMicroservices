# Student Service API

A simple Spring Boot application that provides endpoints to manage and retrieve information about students.

## Features
- Retrieve student by ID
- Retrieve students by hobby

## Endpoints

### 1. Get Student by ID

**URL**: `/api/students/{id}`  
**Method**: `GET`

**Path Parameters**: 
- `id` (required): The ID of the student.

**Response**:
- Returns a `Student` object if found.
- Returns `404 Not Found` if the student with the given ID does not exist.
