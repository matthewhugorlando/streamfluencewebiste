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
                    var url = "/rest/streamer/info?oat=" + Twitch.getToken();
                    var res = $http.get(url);
                    res.success(function(data, status, headers, config) {
                        $scope.streamer = data;
                        // window.location.replace("/");
                    });
                    res.error(function(data, status, headers, config) {
                        console.log("FAILED");
                    });
                    var url2 = "/rest/streamer/list";
                    var res2 = $http.get(url2);
                    res2.success(function(data, status, headers, config) {
                        $scope.streamers = data;
                    });
                    res2.error(function(data, status, headers, config) {
                        console.log("FAILED TO GET LIST");
                    });
                }
            });
        });

        $scope.twitchLogin = function() {
            Twitch.login({
                scope: ['user_read', 'channel_read']
            });
        };

    })