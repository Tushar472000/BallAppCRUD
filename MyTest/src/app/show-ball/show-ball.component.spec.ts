import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowBallComponent } from './show-ball.component';

describe('ShowBallComponent', () => {
  let component: ShowBallComponent;
  let fixture: ComponentFixture<ShowBallComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ShowBallComponent]
    });
    fixture = TestBed.createComponent(ShowBallComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
