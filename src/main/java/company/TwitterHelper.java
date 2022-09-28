package company;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterHelper {
	
	public static int postTweet(String message, String consumerKey, String consumerSecret, String accessToken, String accessTokenSecret) throws TwitterException {

		//A tweet can have only 280 caracters
		if (message.length() > 280)
		{
		     message = message.substring(0, 279);
		}
		
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true).setOAuthConsumerKey(consumerKey)
				.setOAuthConsumerSecret(consumerSecret)
				.setOAuthAccessToken(accessToken)
				.setOAuthAccessTokenSecret(accessTokenSecret);

		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
		twitter.updateStatus(message);
		
		
		return 0;

	}
}