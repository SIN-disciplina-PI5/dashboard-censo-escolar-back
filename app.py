from flask import Flask, jsonify, request
from flask_cors import CORS
import pickle
import numpy as np

app = Flask(__name__)
CORS(app)

model = pickle.load(open('./model.sav', 'rb'))

def orderData(data):
    return [data[param] for param in ['region-code', 'uf-code', 'county-code', 'meso-region-code', 'micro-region-code', 'district-code', 'dependency-type', 'location-type', 'diff-location-type', 'education-department-link', 'public-security-link', 'health-department-link', 'other-department-link']]

@app.route('/predict', methods=['POST'])
def predict():
    try:
        data = request.get_json()
        input = orderData(data)

        prediction = model.predict([input])

        return jsonify({ 'prediction': prediction.tolist()[0] })
    except Exception as e:
        return jsonify({ 'error': str(e) })

if __name__ == '__main__':
    app.run(port=5000, debug=True)