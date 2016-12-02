class displayRessourceController {
	constructor() {
		this.name = 'Service 1';
		this.description = 'Description du service';
		this.adress = '101 route de narbonnne';
		this.service =
		[
			{
				description: 'Kinder Bueno',
				quantity: 4,
				avaibility: true
			},
			{
				description: 'Chambre de Fortune',
				placeAvailable: 4
			}
		];
	}
}

export default displayRessourceController;
