angular.module('leroleroApp', ['ngResource'])
    .config(['$resourceProvider', function($resourceProvider){
        $resourceProvider.defaults.stripTrailingSlashes = false;
    }])
    .factory('Api', ['$resource', function($resource){
        return $resource('http://localhost:8080/api'); // TODO (maedabr) pegar a url por ambiente
    }])
    .controller('LeroLeroController', ['Api', function(Api) {
        var vm = this;
        vm.model = {};

        vm.get = function() {
            vm.model = Api.get(function() {});
        };
    }]);