import _ from 'lodash';
import request from 'request';
import config from 'config';
import ModelController from '../base/model_controller';


let url = 'http://bdd-standnew.cloudapp.net:8000/ViolationGet.svc?singleWsdl';

export default class ViolationsController extends ModelController {
  constructor () {
    super();
    this.logPrefix = 'violations-controller';
    this.urlPrefix = '/violations';
    this.actions = ['list'];

    this.auth = true;
  }

  list (req, res, next) {
    request (config.proxy.violations.url, (err, response, body) => {
      let collection = [];
      _.forEach(JSON.parse(body), (violation) => {
        collection.push({
          __v: 0,
          sum: violation.fineCost,
          name: violation.driverFullName,
          descr: violation.typeNameRu,
          post: violation.postAddress,
          number: violation.orderNumber,
          model: violation.model,
          plate: violation.plate,
          date: violation.fixationDate,
          status: violation.statusNameRu,
        });
      });

      res.json({
        total: collection.length,
        page: 1,
        per_page: 20,
        collection
      });
    });
  }
}
