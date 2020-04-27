'use strict';

/* Services */

// Demonstrate how to register services
angular.module('secondModule', [])
  .service('UserService',['$http', function($http) {
  var self = this;  
   
   this.login = function(user) {
     alert(user);
     return $http.post('/userLogin',user);
   }
}]);
