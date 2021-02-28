import { WebPlugin } from '@capacitor/core';
import { EchoPlugin } from './definitions';

export class EchoWeb extends WebPlugin implements EchoPlugin {
  constructor() {
    super({
      name: 'Echo',
      platforms: ['web'],
    });
  }

  async echo(options:{}): Promise< string > {
    console.log(options);
    
    return 'Hello'
  }
}

const Echo = new EchoWeb();

export { Echo };

import { registerWebPlugin } from '@capacitor/core';
registerWebPlugin(Echo);
