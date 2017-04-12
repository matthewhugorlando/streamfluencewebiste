angular.module("app", [])

    .controller('login', function($scope, $http) {

        $(document).ready(function(){
            console.log("Welcome to Streamers!");
            Twitch.init({clientId: 'q1xf84du1sgbb7a5ryqn3un7epxzw5'}, function(error, status) {
                // the sdk is now loaded
            });
            Twitch.getStatus(function(err,status){
                if(status.authenticated) {
                    console.log("Authenticated");
                }
            });
        });

        $scope.twitchLogin = function() {
            Twitch.login({
                scope: ['user_read', 'channel_read']
            });
            alert(Twitch.getToken());
        };

    })