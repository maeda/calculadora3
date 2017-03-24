angular.module('leroleroApp', ['ngResource'])
    .config(['$resourceProvider', function($resourceProvider){
        $resourceProvider.defaults.stripTrailingSlashes = false;
    }])
    .factory('Api', ['$resource', function($resource){
        return $resource('http://localhost:8080/api')
    }])
    .controller('LeroLeroController', ['Api', function(Api) {
        var vm = this;
        vm.model = [];

        vm.get = function() {
            vm.model = Api.get()
        };
    }]);