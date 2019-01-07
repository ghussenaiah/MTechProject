controller.controller('LoginController',['$scope','authService','$location','$window','$cookies',function($scope,authService,$location,$window,$cookies) {
     $scope.user={};
     $scope.errorDiv  = false;
     var searchObject = $location.search();
     $scope.user.continueTo=searchObject.continue;
     var token=$cookies.get("token");
     if(token){
    	 $window.location.href=searchObject.continue+"?token="+token+"&service=auth";
     }
      $scope.login=function(){
    	  $scope.errorDiv  = false;
    	  console.log($scope.user)
      	authService.authenticate($scope.user).$promise.then(function(data) {
            if(data){
           	  $window.localStorage.removeItem("token");
           	  $window.localStorage.token=data.token;
           	  if(data.continueTo)
		           	{
           		  		//authService.get();
           		  		$window.location.href=data.continueTo+"?token="+data.token+"&service=auth";
		           	}
           	  else if(data.errorCode){
           		$scope.errorDiv  = true;
				$scope.error={};
				$scope.error=data.errorMessage;
           	  }
           	  else{
           		alert("cool Dude!! You are in")
           	  }
			}
		});
      };
 }]);