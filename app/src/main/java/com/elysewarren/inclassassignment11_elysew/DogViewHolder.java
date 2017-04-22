package com.elysewarren.inclassassignment11_elysew;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by elysewarren on 4/17/17.
 */

public class DogViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView dogNameText;
    private TextView dogAgeText;
    private TextView dogAliveText;
    private Context context;

    public DogViewHolder(View itemView) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        dogNameText = (TextView) itemView.findViewById(R.id.dog_name);
        dogAgeText = (TextView) itemView.findViewById(R.id.dog_age);
        dogAliveText = (TextView) itemView.findViewById(R.id.dog_alive);
        this.context = itemView.getContext();
    }

    public void bind(final Dog dog) {
        dogNameText.setText(dog.name);
        dogAgeText.setText("Age:" + dog.age);
        dogAliveText.setText("Alive:" + dog.alive);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, dogNameText.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }


}
