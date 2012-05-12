package db.amzn;

import com.amazonaws.auth.*;
import play.Play;
import com.amazonaws.services.dynamodb.*;
import com.amazonaws.services.dynamodb.model.*;

public class DynamoDb {

	AmazonDynamoDBClient client() {
		String keyId = Play.application().configuration().getString("amzn.key.id");
		String keySecret = Play.application().configuration().getString("amzn.key.secret");
		AWSCredentials credentials = new BasicAWSCredentials(keyId, keySecret);

        return new AmazonDynamoDBClient(credentials);
    }
  
 
  
  
}