class RessourceFixeService {
	constructor($http) {
		'ngInject';
		this.$http = $http;
	}



	getResource() {
		return this.$http.get('/poi/findAll')
			.then(function successCallback(response) {
					return response;
			}, function errorCallback(response) {
				return false;
			});
	}

	putResource(resource) {
		if (!resource) {
			return false;
		}

		return this.$http.put('/url', resource)
			.then(function successCallback(response) {
				return true;
			}, function errorCallback(response) {
				return false;
			});
	}
}

export default RessourceFixeService;
