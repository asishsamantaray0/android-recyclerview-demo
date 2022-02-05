package com.asish.companyinfo.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.asish.companyinfo.R;
import com.asish.companyinfo.models.CompanyModel;
import java.util.List;

/**
 * Adapter class for RecyclerView.
 */
public class CompanyAdapter extends RecyclerView.Adapter<CompanyAdapter.CompanyViewHolder> {

    private final List<CompanyModel> companies;

    public CompanyAdapter(List<CompanyModel> companies) {
        this.companies = companies;
    }

    /**
     * onCreateViewHolder method is responsible to inflate or display the single row layout.
     */
    @NonNull
    @Override
    public CompanyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.company_row_item, parent, false);
        return new CompanyViewHolder(view);
    }

    /**
     * onBindViewHolder method is responsible to bind the value to the view.
     */
    @Override
    public void onBindViewHolder(@NonNull CompanyViewHolder holder, int position) {
        CompanyModel companyModel = companies.get(position);
        holder.getLogo().setImageResource(companyModel.getLogo());
        holder.getName().setText(companyModel.getName());
        holder.getCeo().setText(companyModel.getCeoName());
    }

    /**
     * Return Size of the RecyclerView.
     *
     * @return Size of the RecyclerView.
     */
    @Override
    public int getItemCount() {
        return companies.size();
    }

    /**
     * CompanyViewHolder class holds the views of each row of RecyclerView.
     */
    public static class CompanyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,
        View.OnLongClickListener {

        private final ImageView logo;
        private final TextView name;
        private final TextView ceo;

        /**
         * Inside this constructor we initialize view or set onclick or set onLingClick listener.
         *
         * @param itemView View Obj.
         */
        public CompanyViewHolder(@NonNull View itemView) {
            super(itemView);
            logo = itemView.findViewById(R.id.iv_logo);
            name = itemView.findViewById(R.id.tv_name);
            ceo = itemView.findViewById(R.id.tv_ceo);
            itemView.setOnClickListener(this);
        }

        public ImageView getLogo() {
            return logo;
        }

        public TextView getName() {
            return name;
        }

        public TextView getCeo() {
            return ceo;
        }

        @Override
        public void onClick(View view) {
            Log.d("CompanyAdapter", "OnClick " + getAdapterPosition() + " " + getName().getText());
        }

        @Override
        public boolean onLongClick(View view) {
            Log.d("CompanyAdapter", "OnLongClick " + getAdapterPosition() + " " + getName().getText());
            return false;
        }
    }
}
