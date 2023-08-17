import { TestBed } from '@angular/core/testing';

import { SeviceGarageService } from './sevice-garage.service';

describe('SeviceGarageService', () => {
  let service: SeviceGarageService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SeviceGarageService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
