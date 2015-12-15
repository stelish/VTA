/**
 * Created by kells4 on 16/12/2015.
 */
app.controller('main',['$scope',function($scope){

    $scope.temp = [
        0,1,2,3,4,5
    ];

    $scope.itinery = [
        {
            "title" : "basic",
            "productType" : "economy",
            "date": "26 Mar 2016",
            "itineryData" : [
                {
                    "type" : "transfer",
                    "options" : [
                        {
                            "vendor": "coop taxis","currencySymbol":"$","currencyType":"NZD","price": "65","date": "26 Mar 2016",
                            "departureTime": "0400","selected": "true", "bookingReference" : "abc123","destination" : "Auckland Domestic Terminal",
                            "arrivalTime" : "0435", "travelTime" : "35"
                        },
                        {
                            "vendor": "cheap cabs","currencySymbol":"$","currencyType":"NZD","price": "55","date": "26 Mar 2016",
                            "time": "0400","selected": "false","bookingReference" : "abc123","destination" : "Auckland Domestic Terminal",
                            "arrivalTime" : "0435", "travelTime" : "35"
                        },
                        {
                            "vendor": "airport shuttles","currencySymbol":"$","currencyType":"NZD","price": "25","date": "26 Mar 2016",
                            "time": "0400","selected": "false","bookingReference" : "abc123","destination" : "Auckland Domestic Terminal",
                            "arrivalTime" : "0435", "travelTime" : "35"
                        }

                    ]
                },
                {
                    "type" : "flight",
                    "options" : [
                        {
                            "selected":"true","currencySymbol":"$","currencyType":"NZD",
                            "destinationIATACode":"AKL","destinationName":"Auckland","flightType":"One Way","originIATACode":"ZQN","originName":"Queenstown",
                            "price":"89","product":"DS","flightNumber" : "NZ0673","equipmentType": "", "carrier" : "AirNZ",
                            "departureDate" : "26 Mar 2016","departureTime" : "0600", "arrivalDate" : "26 Mar 2016","arrivalTime" : "0735", "travelTime" : "95"
                        },
                        {
                            "selected":"true","currencySymbol":"$","currencyType":"NZD",
                            "destinationIATACode":"AKL","destinationName":"Auckland","flightType":"One Way","originIATACode":"ZQN","originName":"Queenstown",
                            "price":"119","product":"DS","flightNumber" : "NZ0673","equipmentType": "", "carrier" : "AirNZ",
                            "departureDate" : "26 Mar 2016","departureTime" : "0800", "arrivalDate" : "26 Mar 2016","arrivalTime" : "0935", "travelTime" : "95"
                        },
                        {
                            "selected":"true","currencySymbol":"$","currencyType":"NZD",
                            "destinationIATACode":"AKL","destinationName":"Auckland","flightType":"One Way","originIATACode":"ZQN","originName":"Queenstown",
                            "price":"129","product":"DS","flightNumber" : "NZ0673","equipmentType": "", "carrier" : "AirNZ",
                            "departureDate" : "26 Mar 2016","departureTime" : "1000", "arrivalDate" : "26 Mar 2016","arrivalTime" : "1135", "travelTime" : "95"
                        },
                        {
                            "selected":"true","currencySymbol":"$","currencyType":"NZD",
                            "destinationIATACode":"AKL","destinationName":"Auckland","flightType":"One Way","originIATACode":"ZQN","originName":"Queenstown",
                            "price":"149","product":"DS","flightNumber" : "NZ0673","equipmentType": "", "carrier" : "AirNZ",
                            "departureDate" : "26 Mar 2016","departureTime" : "1500", "arrivalDate" : "26 Mar 2016","arrivalTime" : "1635", "travelTime" : "95"
                        },
                    ]
                },
                {
                    "type" : "rentalcar",
                    "options" : [
                        {
                            "vendor": "jucy","currencySymbol":"$","currencyType":"NZD","price": "55","date": "26 Mar 2016",
                            "time": "0400","selected": "false","bookingReference" : "abc123","destination" : "Auckland Domestic Terminal",
                            "arrivalTime" : "0435", "travelTime" : "35"
                        },
                        {
                            "vendor": "avis","currencySymbol":"$","currencyType":"NZD","price": "25","date": "26 Mar 2016",
                            "time": "0400","selected": "false","bookingReference" : "abc123","destination" : "Auckland Domestic Terminal",
                            "arrivalTime" : "0435", "travelTime" : "35"
                        }

                    ]
                },
                {
                    "type" : "accomidation",
                    "options" : [
                        {
                            "vendor": "hertitage","currencySymbol":"$","currencyType":"NZD","price": "65","date": "26 Mar 2016",
                            "departureTime": "0400","selected": "true", "bookingReference" : "abc123","destination" : "Auckland Domestic Terminal",
                            "arrivalTime" : "0435", "travelTime" : "35"
                        },
                        {
                            "vendor": "cheap cabs","currencySymbol":"$","currencyType":"NZD","price": "55","date": "26 Mar 2016",
                            "time": "0400","selected": "false","bookingReference" : "abc123","destination" : "Auckland Domestic Terminal",
                            "arrivalTime" : "0435", "travelTime" : "35"
                        },
                        {
                            "vendor": "airport shuttles","currencySymbol":"$","currencyType":"NZD","price": "25","date": "26 Mar 2016",
                            "time": "0400","selected": "false","bookingReference" : "abc123","destination" : "Auckland Domestic Terminal",
                            "arrivalTime" : "0435", "travelTime" : "35"
                        }

                    ]
                },


            ]

        }
    ]
}]);
