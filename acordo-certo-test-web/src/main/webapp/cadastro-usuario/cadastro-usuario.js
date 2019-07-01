'use strict';

angular.module('myApp.cadastro-usuario', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
    $routeProvider.when('/cadastro-usuario', {
        templateUrl: 'cadastro-usuario/cadastro-usuario.html',
        controller: 'CadastroUsuaropCtrl'
    });
}])

.controller('CadastroUsuaropCtrl', ['$scope', 'cadastroUsuarioService', function($scope, cadastroUsuarioService) {

    $scope.usuario = newUsuario();

    $scope.msgSuccess = false;
    $scope.msgError = false;

    $scope.cadastrar = function() {
        cadastroUsuarioService.async($scope.usuario).then(function(d) {
            $scope.msgSuccess = true;
            $scope.usuario = newUsuario();
        }).catch(function(response) {
            $scope.msgError = true;
        });
    }

}]);


function newUsuario() {
    return {
        id: '',
        nome: '',
        setor: '',
        valeRefeicao: ''
    }

}