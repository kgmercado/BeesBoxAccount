package org.bees.box.accounts;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.util.StringUtils;

@Configuration
@EnableDynamoDBRepositories(basePackages="org.bees.box.accounts.repository")
public class DynamoDBConfig {
	
	@Value("${amazon.dynamodb.endpoint}")
	private String dbEndPoint;
	
	@Value("${amazon.aws.accesskey}")
	private String accessKey;

	@Value("${amazon.aws.secretkey}")
	private String secretKey;
	
	@Bean
	public AmazonDynamoDB amazonDynamoDB() {
		AmazonDynamoDB dynamoDB = new AmazonDynamoDBClient(awsCredentials());

		if ( ! StringUtils.isNullOrEmpty(dbEndPoint)) {
			dynamoDB.setEndpoint(dbEndPoint);
		}
		
		return dynamoDB;
	}
	
	@Bean
	public AWSCredentials awsCredentials() {
		return new BasicAWSCredentials(accessKey, secretKey);
	}
}
