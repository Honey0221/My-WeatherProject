package zerobase.weather.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Entity(name = "date_weather")
@NoArgsConstructor
public class DateWeather {
    @Id
    @GeneratedValue
    private LocalDate date;

    private String weather;
    private String icon;
    private double temperature;
}
