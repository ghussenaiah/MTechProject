services.factory("authService", function($resource,$location){
	return $resource('/KagamiAuthService/auth/auth/login', {} , 
{
        'authenticate':   { 
        			method:'POST'/*,
        			interceptor : {
						   responseError : function(response){
						   		console.log(response);
						   		if(response.data && response.data.error){
           						   return  response.data.error;
           					 }
           					 else{
           					 	return "Oops!! Something went wrong :(";
           					 }
						   },
       				   response:function(response){
       					   console.log(response);
 	  					 if(response.data && response.data.error){
       					   }else if(response.data && response.data.verbOutputData){
       					   }
       					   else{
       					   		return "Oops!! Something went wrong :(";
       					   }
      				  }
   				 }*/
	              },  
});

});

