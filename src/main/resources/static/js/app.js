angular.module('calculadoraApp', ['ngResource'])
    .config(['$resourceProvider', function($resourceProvider){
        $resourceProvider.defaults.stripTrailingSlashes = false;
    }])
    .factory('Api', ['$resource', function($resource){
        return $resource('http://localhost:8080' + '/api', null, {
            'query': {
                method: 'GET',
                isArray: false
            }
        }); // TODO (maedabr) pegar a url por ambiente
    }])
    .controller('CalculadoraController', ['Api', function(Api) {
        var vm = this;
        vm.model = {};
        vm.get = function() {
            vm.model.response = Api.query({'calculo': vm.model.calculo}, function() {
            });
        };
    }]);