class RessourceFixeService {
	constructor(ressourceFixe) {
		this.ressourceFixe = ressourceFixe;
	}

	createResource(resource) {
		if(!this.nom && !this.description) {
			return false;
		}

		return ressourceFixe.putRessource();
	}
}

export default RessourceFixeService;
