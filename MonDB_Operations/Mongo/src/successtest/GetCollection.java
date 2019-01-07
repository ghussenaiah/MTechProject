package successtest;



import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.DBCursor;

import com.mongodb.ServerAddress;
import java.util.Arrays;

public class GetCollection {

   public static void main( String args[] ) {
	
      try{   
		
        
         Mongo mongoClient = new Mongo( "localhost" , 27017 );
			
       
         DB db = mongoClient.getDB( "test" );
         System.out.println("Connect to database successfully");
			

         DBCollection coll = db.getCollection("mycol");
         System.out.println("Collection mycol selected successfully");
			
        DBCursor cursor = coll.find();
         
        // DBCursor cursor=  coll.find({"title":"MongoDB"},{"likes" : 1}); 
         int i = 1;
			
         while (cursor.hasNext()) { 
        	 
        	 System.out.println();
            System.out.println("Inserted Document: "+i); 
            System.out.println(cursor.next()); 
            i++;
         }

         
         
      }catch(Exception e){
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      }
   }
}