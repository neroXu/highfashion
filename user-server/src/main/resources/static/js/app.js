'use strict';


// Declare app level module which depends on filters, and services
angular.module('myApp', ['firstModule', 'secondModule'])
.config(['$routeProvider', function($routeProvider) {
    $routeProvider.when('/home', {templateUrl: 'page/home.html'});
    $routeProvider.when('/login', {templateUrl: 'page/login.html'});
    $routeProvider.when('/regist', {templateUrl: 'page/regist.html'});
    $routeProvider.when('/cart', {templateUrl: 'page/cart.html'});
    $routeProvider.when('/product_list', {templateUrl: 'page/product_list.html'});
    $routeProvider.otherwise({redirectTo: '/home'});
  }]);
