import ModelController from '../base/model_controller';

export default class ViolationsController extends ModelController {
  constructor () {
    super();
    this.logPrefix = 'violations-controller';
    this.urlPrefix = '/violations';
    this.actions = ['list'];

    this.auth = true;
  }

  list (req, res, next) {
    res.send([{
      id: 1,
      sum: 9052,
      name: 'УЛЬЯНОВ ИОСИФ',
      descr: 'Несоблюдение требований, предписанных дорожными знаками или разметкой проезжей части дороги',
      post: 'пр. Республики - ул. Иманова',
      number: '0326.4380015',
      model: 'LEXUS RX350',
      date: new Date(2015, 5, 19, 14, 40, 11),
      status: 'Не оплачено',
    }]);
  }
}
