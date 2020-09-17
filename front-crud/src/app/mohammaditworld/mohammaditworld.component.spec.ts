import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MohammaditworldComponent } from './mohammaditworld.component';

describe('MohammaditworldComponent', () => {
  let component: MohammaditworldComponent;
  let fixture: ComponentFixture<MohammaditworldComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MohammaditworldComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MohammaditworldComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
