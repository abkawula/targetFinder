package com.mycompany.app.core;

public class EventParameters {

	private String zip;
	private Double latitude;
	private Double longitude;
	private int radius;
	private DistanceUnit distanceUnit;
	
	public EventParameters(EventParameterBuilder epb) {
		this.zip = epb.zip;
		this.latitude = epb.latitude;
		this.longitude = epb.longitude;
		this.radius = epb.radius;
		this.distanceUnit = distanceUnit;
	}
	public static class EventParameterBuilder {
		private String zip;
		private Double latitude;
		private Double longitude;
		private int radius;
		private DistanceUnit distanceUnit;
		
		public EventParameterBuilder withZip(String zip) {
			this.zip = zip;
			return this;
		}
		
		public EventParameterBuilder withLatitude(Double latitude) {
			this.latitude = latitude;
			return this;
		}
		
		public EventParameterBuilder withLongitude(Double longitude) {
			this.longitude = longitude;
			return this;
		}
		
		public EventParameterBuilder withRadius(int radius) {
			this.radius = radius;
			return this;
		}
		
		public EventParameterBuilder withDistanceUnit(DistanceUnit distanceUnit) {
			this.distanceUnit = distanceUnit;
			return this;
		}
	}
	
	
}
