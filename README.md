
# Daily Quote! 

## What it does?
It is a Mulesoft ESB app that tweets a daily quote from the movies Lord Of the Rings (LOTR).


## What is the data source?
I'm using the nice API created by Ulrike Exner (http://rike.dev) that returns LOTR content. Thanks Rike ;)


## How to run it?

This app integrates a LOTR content API and the Twitter v2 API, so you will need the following resources to run it.

1. A twitter account
   - How-to: https://help.twitter.com/en/resources/twitter-guide/twitter-101/how-to-set-up-your-twitter-account-twitter-help

2. A twitter developer account using Twitter API v2 updated to Elevated (everything is free)
   - How-to: https://www.extly.com/docs/perfect_publisher/user_guide/tutorials/how-to-auto-post-from-joomla-to-twitter/apply-for-a-twitter-developer-account/#apply-for-a-developer-account

3. A Lord of the Rings (LOTR) API developer account
   - How-to: https://the-one-api.dev/sign-up
   
4. Create a new file src/main/resources/local.properties with authorization info from twitter and LOTR APIs.

```
dailyquote.http.port: 8081
    
twitter.host: api.twitter.com
twitter.oauth.consumer_key: [value]
twitter.oauth.consumer_secret: [value]
twitter.oauth.access_token: [value]
twitter.oauth.token_secret: [value]

lotr.host: the-one-api.dev
lotr.authorization: [value]
  
 ```
  
## Testing

You can use postman (https://www.postman.com/) to test it. 
The offline version of this tool is needed to performs tests against localhost.

1. http://localhost:8081/api/quoteoftheday
   - Returns a JSON object with a random quote

```
   {
       "quote": "'War? Yes. It affects us all. Tree, root and twig. But you must understand, young Hobbit......it takes a long time......to say anything in Old Entish... ...and we never say anything......unless it is worth taking......a long time to say.'",
       "author": "'Treebeard'",
       "source": "'The Two Towers '"
   }
 ``` 
  

2. http://localhost:8081/api/tweetdailyquote
   - Actually post the quote using the twitter account and return a string with the quote posted.
   
```
     "Yes, yes." - BILBO BAGGINS [The Fellowship of the Ring]
```
   
## Whishlist for future/possible updates
   - Tweet quotes in several languages through Google Translator API or similar.
   - Tweet a picture of the movie caracter owner of the quote along with it its quote.
   - Write proper error handlings including sending e-mails to system admin when an exception happens.
   - Integrate with Github actions to automatically build and deploy in CloudHub.


###### I'm using Mule 4 in this app
