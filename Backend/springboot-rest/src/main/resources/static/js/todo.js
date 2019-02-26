
angular.module('todo', []).controller("TodoCtrl", function($scope, $http) {

  $scope.load = function ()  {
    $http.get('todo').
      success(function(data, status, headers, config) {
        $scope.todos = data;
      }).
      error(function(data, status, headers, config) {
        // log error
      });
  };

  $scope.save = function ()  {
    $http.post('todo', angular.toJson($scope.todo)).success(function () { 
    	
    	console.log("hallo");
    	$scope.load();
    });
  };

  $scope.delete = function (id)  {
    $http.delete("todo/" + id).success(function () { 
    	$scope.load();
    });
  };
});

