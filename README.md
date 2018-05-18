# article-builder-react

## Introduction

Side-project of a small article builder for quarterly rock.

### To build

You will need to pull down this project. Then in the `api/src/main/resources` directory, you will need to add the right values for the empty properties. The API uses a DynamoDB backend but will not require a key and secret code if you are using a local instance of DynamoDB. 

DynamoDB will need two tables:
1. A `user` table with a String key of `id`.
2. A `article` table with a String key of `id`.
