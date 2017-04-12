angular.module("app", [])

    .controller('login', function($scope, $http) {

        $scope.twitchLogin = function() {
            Twitch.login({
                scope: ['user_read', 'channel_read']
            });
        };

    })