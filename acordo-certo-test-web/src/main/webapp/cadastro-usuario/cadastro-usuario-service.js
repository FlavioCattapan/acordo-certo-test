app.factory('cadastroUsuarioService', function($http) {
    return {
        async: function(usuario) {
            var url = 'http://localhost:8080/api/usuario';
            return $http.post(url, usuario);
        }
    };
});