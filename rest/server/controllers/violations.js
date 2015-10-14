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
    res.json({
      total: 2,
      page: 1,
      per_page: 20,
      collection: [{
        _id: 1,
        __v: 0,
        sum: 9052,
        name: 'УЛЬЯНОВ ИОСИФ',
        descr: 'Несоблюдение требований, предписанных дорожными знаками или разметкой проезжей части дороги.',
        post: 'пр. Республики - ул. Иманова',
        number: '0326.4380015',
        model: 'LEXUS RX350',
        plate: 'H326MDM',
        date: new Date(2015, 5, 19, 14, 40, 11),
        status: 'Не оплачено',
      }, {
        _id: 2,
        __v: 0,
        sum: 17366,
        name: 'УЛЬЯНОВ ИОСИФ',
        descr: 'Несоблюдение требований, предписанных дорожными знаками или разметкой проезжей части дороги.',
        post: 'пр. Туран - ул. Челюскинцев',
        number: '0326.6543001',
        model: 'LEXUS RX350',
        plate: 'H326MDM',
        date: new Date(2015, 9, 2, 4, 12, 50),
        status: 'Не оплачено',
      }]
    });
  }
}
